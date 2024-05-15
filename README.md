# sbt-sass issue

This is a sample application for an issue observed with SBT sub-projects and
[sbt-sassify](https://github.com/irundaia/sbt-sassify).

## Setup

 - a Play Framework Scala application with an SBT sub-project;
 - the `sbt-sassify` plugin enabled in `project/plugins.sbt`
 - a SASS file in the sub-project that is compiled to CSS used on the 
   application's HTML page
 - run the dev server sbt `sbt run` on the root project

## What should happen?

 - changes to the SASS file `subproj/app/assets/stylesheets/main.scss`
   trigger recompilation of the CSS
 - this is propagated to the root project and the change is 
   visible in the browser

## What does happen?

 - recompilation of CSS is triggered in the sub-project
 - the updated file is **not** propagated to the root project and
   the change is not visible

## How to see this working as expected?

 - switch the Play version to 2.8.21 in `project/plugins.sbt`
   and re-run `sbt run`




