import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { MsxSampleApplicationSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [MsxSampleApplicationSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [MsxSampleApplicationSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class MsxSampleApplicationSharedModule {
  static forRoot() {
    return {
      ngModule: MsxSampleApplicationSharedModule
    };
  }
}
