<script setup>
import Pagination from "@/components/Pagination.vue";
import { specimenStore } from "../../stores/SpecimenStore";
import { onBeforeMount } from "vue";


const specimenstore = specimenStore();
onBeforeMount(() => {
  specimenstore.Asign();
  console.log(specimenstore.specimens);
})

</script>
<template>
<div class="wrapper-specimen-list">
<div class="content read">
	<!-- <h2>Read Tracks</h2> -->
	<a href="create.php" class="create-contact"></a>
	<table>
        <thead>
            <tr>
                <!-- <td>#</td> -->
                <td>Name</td>
                <td>Type</td>
                <td>Family</td>
                <td>Gender</td>
                <td>Date</td>
                <td></td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Judy Hopps</td>
                <td>Rabbit</td>
                <td>Leporids</td>
                <td>Female</td>              <td>25/12/2019</td>
                <!-- <td>0.99</td> -->
                <td class="actions">
                    <a href="#" class="edit"><i class="gg-pen"></i></a>
                    <a href="" class="trash"><i class="gg-trash"></i></a>
                </td>
            </tr>
          
          
           
        </tbody>
    </table>

</div>
</div>
    <div class="wrapper-specimen-list">
        <div class="filter-section">
            <select name="" id=""></select>
            <select name="" id=""></select>
        </div>

        <Pagination></Pagination>
    </div>
    
</template>
<style lang="scss" scoped>
@use "@/sass/styles.scss" as *;
.wrapper-specimen-list{
  background: $background-inputs;
 

* {
  	box-sizing: border-box;
  	font-family: -apple-system, BlinkMacSystemFont, "segoe ui", roboto, oxygen, ubuntu, cantarell, "fira sans", "droid sans", "helvetica neue", Arial, sans-serif;
  	font-size: 100%;
  	-webkit-font-smoothing: antialiased;
  	-moz-osx-font-smoothing: grayscale;
}

.content {
  	max-width: 100%;
  	margin: 0 auto;
   
}

.content h2 {
  	margin: 0;
  	padding: 7em 0;
  	font-size: 10em;
  	border-bottom: 1px solid #ebebeb;
  	color: #666666;
}

.read .create-contact:hover {
  	background-color: #32a367;
}
.read .pagination {
  	display: flex;
  	justify-content: center;
}
.read .pagination a {
  	display: inline-block;
  	text-decoration: none;
  	background-color: #a9a6a5;
  	font-weight: bold;
  	color: #FFFFFF;
  	padding: 5em 10em;
  	margin: 15em 0 15em 5em;
}
.read .pagination a:hover {
  	background-color: #999b9d;
}
.read table {
  	width: 100%;
  	padding-top: 30em;
  	border-collapse: collapse;
    
}
.read table thead {
  	background-color: #ebeef1;
  	border-bottom: 1px solid #d3dae0;
    
}
.read table thead td {
  	padding: 1em;
  	font-weight: bold;
  	color: #767779;
  	font-size: 14px;
}
.read table tbody tr {
  background-color: $background-table2;
  	border-bottom: 1px solid #d3dae0;
    
}
.read table tbody tr:nth-child(even) {
  	background-color: $background-table1;
}
.read table tbody tr:hover {
  	background-color: #3d8963;
}
.read table tbody tr:hover td {
  	color: #FFFFFF;
}
.read table tbody tr:hover td:nth-child(1) {
  	color: #FFFFFF;

}
.read table tbody tr td {
 
  	padding: 1em;
}

.read table tbody tr td.actions {
  	padding: 0.5em;
  	text-align: right;
    display: flex;
    
}
.read table tbody tr td.actions .edit, .read table tbody tr td.actions .trash {
  	display: inline-flex;
  	text-align: right;
  	text-decoration: none;
  	color: #171616;
  	padding: 1em 1em;
}
.read table tbody tr td.actions .trash {
  	background-color: $background-buttons-icons;
}
.read table tbody tr td.actions .trash:hover {
  	background-color: $background-buttons;
}
.read table tbody tr td.actions .edit {

  	background-color: $background-buttons-icons;
}
.read table tbody tr td.actions .edit:hover {
  	background-color: $background-buttons;
}

.delete .yesno {
  	display: flex;
}
.delete .yesno a {
  	display: inline-block;
  	text-decoration: none;
  	background-color: #38b673;
  	font-weight: bold;
  	color: #FFFFFF;
}
.delete .yesno a:hover {
  	background-color: #32a367;
}
.actions  {
  
  align-items: inherit;

  .edit {
    height: 3em;
    margin: 0.5em;
    border-radius: 10px;
  }
  .trash {
    height: 3em;
    margin: 0.5em;
    border-radius: 10px;

  }

}
}
// @media (min-width: 320px) and (max-width: 374px) {
//     // Phone design
//     .content {
//       width: 100%;
//     }
//   }
  // @media (min-width: 375px) and (max-width: 1023px) {
  //   // Tablet design
  // }
  // @media (min-width: 769px) and (max-width: 1024px) {
  //   // Laptop design
  // }
  // @media (min-width: 1025px) and (max-width: 1200px){
  //   // Desktop design
  // }
</style>