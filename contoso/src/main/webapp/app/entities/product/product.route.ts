import { Routes } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { ProductComponent } from './product.component';
import { ProductDetailComponent } from './product-detail.component';
import { ProductPopupComponent } from './product-dialog.component';
import { ProductDeletePopupComponent } from './product-delete-dialog.component';

export const productRoute: Routes = [
    {
        path: 'product',
        component: ProductComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Products'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'product/:id',
        component: ProductDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Products'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const productPopupRoute: Routes = [
    {
        path: 'product-new',
        component: ProductPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Products'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'product/:id/edit',
        component: ProductPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Products'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'product/:id/delete',
        component: ProductDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Products'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
