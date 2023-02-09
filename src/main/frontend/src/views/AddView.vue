<script setup> 
import dashboardAside from '../components/dashboard/dashboardAside.vue';
import Header from '../components/Header.vue';
import FormTable from '../components/FormTable.vue';
</script>
<template>
    <main>
      <div class="header">
        <Header/>
      </div>
    <div class="container">
      <dashboardAside />
      <div class="form">
      <FormTable/>
      </div>
    </div>
  
    </main>
  </template>

<style lang="scss" scoped>
 @use "./src/sass/styles.scss" as *;
 
 main{
    background: $background-page;
    background-repeat: no-repeat;
    background-size: cover ;
        .header {
          padding-top: 30px;
          margin: 0 auto;    
        }
    
        .container{
        padding-top: 5em;
        padding-left: 5em;
        display: flex;

            .form{
                width: 100%;
            }
    
        }
  }
</style>