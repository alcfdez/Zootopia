<script setup>
import { ref } from 'vue';
import { useRouter, useRoute, RouterView } from 'vue-router';

const router = useRouter();
const shotList = ()=>{

    router.push({name: 'list',path:'/dashoard/list'})
}
const shotCreate = ()=>{

    router.push({name: 'create',path:'/dashboard/create'})
}
const ShotDisconnect = ()=>{
    router.push({name:'', path:'/'})
}

</script>
<template> 
<div class="aside-bar">
    <div class="list-shot" @click="shotList()">
      <h2> <RouterLink to="/dashboard">List</RouterLink></h2>
    </div>
    <div class="create-shot"  @click="shotCreate()">
     
      <h2> <RouterLink to="/AddView">Create</RouterLink></h2>
    </div>
    <div class="number-specimens">
       <h2>Number of specimens 20</h2>
    </div>
    <div class="disconnect-shot"  @click="ShotDisconnect()">
        <h2>Disconnect</h2>
    </div>
</div>
<div>
    <router-view/>
</div>
 
</template>
<style lang="scss" socped>
@use '../../sass/styles.scss' as *;
@mixin border($RowInit, $ColumnInit , $RowEnd, $columnEnd) {
  grid-row-start: $RowInit;
  grid-row-end: $RowEnd;
  grid-column-start: $ColumnInit;
  grid-column-end: $columnEnd;
  border: 2px solid;
  margin: 0.5em;
}

@mixin gridDisplay($FirstArgument, $SecondArgument) {
  display: grid;
  grid-template: repeat($FirstArgument, 1fr) / repeat($SecondArgument, 2fr);
}
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
.aside-bar{
    @include box($background-box, $border-radius, $background-box);
    border: 1px solid;
    width: 20%;
    height: 30em;
    @include gridDisplay(10, 1);

    .list-shot{
        @include box($background-buttons-icons, $border-radius, $background-box);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        font-size: 1em;
        & a:visited{
          color:$font-color-text;
        }
        @include border(1, 1, 1, 1)
    }
    .create-shot{
        @include box($background-buttons-icons, $border-radius, $background-box);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        font-size: 1em;
        & a:visited{
          color:$font-color-text;
        }
        @include border(2, 1, 3, 1)
}

    .number-specimens{
        font-size: 1em;
        color: white;
        max-width: 90%;
        margin: 3em;
        display: flex;
        justify-content: center;
        align-items: center;
       
    }
    .disconnect-shot{
        @include box($background-buttons-icons, $border-radius,  $background-box);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(10, 1, 11, 1)
    }
    
}
</style>