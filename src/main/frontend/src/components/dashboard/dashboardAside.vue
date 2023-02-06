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
        <h2>List</h2>
    </div>
    <div class="create-shot"  @click="shotCreate()">
        <h2>Create</h2>
    </div>
    <div class="number-specimens">
        <h2>number specimens</h2>
    </div>
    <div class="disconnect-shot"  @click="ShotDisconnect()">
        <h2>Disconnect</h2>
    </div>
</div>
<div>
    <router-view></router-view>
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
  margin: 10px;
}

@mixin gridDisplay($FirstArgument, $SecondArgument) {
  display: grid;
  grid-template: repeat($FirstArgument, 1fr) / repeat($SecondArgument, 1fr);
}
*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
.aside-bar{
    @include box($background-box, $border-radius);
    border: 1px solid;
    width: 25%;
    height: 100vh;
    @include gridDisplay(10, 1);

    .list-shot{
        @include box($background-buttons-icons, $border-radius);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(1, 1, 1, 1)
    }
    .create-shot{
        @include box($background-buttons-icons, $border-radius);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(2, 1, 3, 1)
    }
    .number-specimens{
        @include box($background-buttons-icons, $border-radius);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(6, 1, 7, 1)
    }
    .disconnect-shot{
        @include box($background-buttons-icons, $border-radius);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(10, 1, 11, 1)
    }
}
</style>