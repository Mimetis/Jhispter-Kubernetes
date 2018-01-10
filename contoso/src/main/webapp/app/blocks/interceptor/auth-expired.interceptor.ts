import { JhiHttpInterceptor } from 'ng-jhipster';
import { Injector } from '@angular/core';
import { RequestOptionsArgs, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { LoginService } from '../../shared/login/login.service';
import { LoginModalService } from '../../shared/login/login-modal.service';
import { Principal } from '../../shared/auth/principal.service';
import { Router } from '@angular/router';

export class AuthExpiredInterceptor extends JhiHttpInterceptor {

    constructor(private injector: Injector) {
        super();
    }

    requestIntercept(options?: RequestOptionsArgs): RequestOptionsArgs {
        return options;
    }

    responseIntercept(observable: Observable<Response>): Observable<Response> {
        return <Observable<Response>> observable.catch((error, source) => {
            if (error.status === 401) {
                const principal = this.injector.get(Principal);

                if (principal.isAuthenticated()) {
                    principal.authenticate(null);
                    const loginModalService: LoginModalService = this.injector.get(LoginModalService);
                    loginModalService.open();
                } else {
                    const loginService: LoginService = this.injector.get(LoginService);
                    loginService.logout();
                    const router = this.injector.get(Router);
                    router.navigate(['/']);
                }
            }
            return Observable.throw(error);
        });
    }
}
