import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'region',
        loadChildren: './region/region.module#MsxSampleApplicationRegionModule'
      },
      {
        path: 'country',
        loadChildren: './country/country.module#MsxSampleApplicationCountryModule'
      },
      {
        path: 'location',
        loadChildren: './location/location.module#MsxSampleApplicationLocationModule'
      },
      {
        path: 'department',
        loadChildren: './department/department.module#MsxSampleApplicationDepartmentModule'
      },
      {
        path: 'task',
        loadChildren: './task/task.module#MsxSampleApplicationTaskModule'
      },
      {
        path: 'employee',
        loadChildren: './employee/employee.module#MsxSampleApplicationEmployeeModule'
      },
      {
        path: 'job',
        loadChildren: './job/job.module#MsxSampleApplicationJobModule'
      },
      {
        path: 'job-history',
        loadChildren: './job-history/job-history.module#MsxSampleApplicationJobHistoryModule'
      }
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ])
  ],
  declarations: [],
  entryComponents: [],
  providers: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class MsxSampleApplicationEntityModule {}
