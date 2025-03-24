/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IFeatureService, moduleUtils, SeEntryModule, SeTranslationModule } from 'smarteditcommons';
import { AbAnalyticsToolbarItemComponent } from './abAnalyticsToolbarItem';
import { DummyInterceptor } from './DummyInterceptor';

@SeEntryModule('smartedittrailContainer')
@NgModule({
    imports: [BrowserModule, SeTranslationModule.forChild()],
    declarations: [AbAnalyticsToolbarItemComponent],
    providers: [
        {
            provide: HTTP_INTERCEPTORS,
            useClass: DummyInterceptor,
            multi: true
        },
        moduleUtils.initialize(
            (featureService: IFeatureService) => {
                // Create the toolbar item as a feature.
                featureService.addToolbarItem({
                    toolbarId: 'smartEditPerspectiveToolbar',
                    key: 'abAnalyticsToolbarItem',
                    type: 'HYBRID_ACTION',
                    nameI18nKey: 'smartedittrail.sample.toolbar.name',
                    descriptionI18nKey: 'smartedittrail.sample.toolbar.description',
                    priority: 2,
                    section: 'left',
                    iconClassName: 'icon-message-information se-toolbar-menu-ddlb--button__icon',
                    component: AbAnalyticsToolbarItemComponent
                });
            },
            [IFeatureService]
        )
    ]
})
export class SmartedittrailContainerModule {}
