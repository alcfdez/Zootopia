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
        <RouterLink to="/dashboard">List</RouterLink>
    </div>
    <div class="create-shot"  @click="shotCreate()">
        <!-- <h2>Create</h2> -->
        <RouterLink to="/AddView">Create</RouterLink>
    </div>
    <div class="number-specimens">
        <h2>number specimens</h2>
    </div>
    <div class="disconnect-shot"  @click="ShotDisconnect()">
        <h2>Disconnect</h2>
    </div>
</div>
<div>
    <router-view/>
</div>



<!-- 
<template>

    <v-data-table
    :headers="headers"
    :items="desserts"
    sort-by="calories"
    class="elevation-1"
  >
    <template v-slot:top>
      <v-toolbar
        flat
      >
        <v-toolbar-title>My CRUD</v-toolbar-title>
        <v-divider
          class="mx-4"
          inset
          vertical
        ></v-divider>
        <v-spacer></v-spacer>
        <v-dialog
          v-model="dialog"
          max-width="500px"
        >
          <template v-slot:activator="{ on, attrs }">
            <v-btn
              color="primary"
              dark
              class="mb-2"
              v-bind="attrs"
              v-on="on"
            >
              New Item
            </v-btn>
          </template>
          <v-card>
            <v-card-title>
              <span class="text-h5">{{ formTitle }}</span>
            </v-card-title>

            <v-card-text>
              <v-container>
                <v-row>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.name"
                      label="Dessert name"
                    ></v-text-field>
                  </v-col>
                  <v-col
                  cols="12"
                  sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.calories"
                      label="Calories"
                    ></v-text-field>
                  </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.fat"
                      label="Fat (g)"
                      ></v-text-field>
                    </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.carbs"
                      label="Carbs (g)"
                      ></v-text-field>
                  </v-col>
                  <v-col
                    cols="12"
                    sm="6"
                    md="4"
                  >
                    <v-text-field
                      v-model="editedItem.protein"
                      label="Protein (g)"
                      ></v-text-field>
                    </v-col>
                </v-row>
              </v-container>
            </v-card-text>

            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn
              color="blue darken-1"
              text
                @click="close"
                >
                Cancel
            </v-btn>
              <v-btn
              color="blue darken-1"
              text
                @click="save"
              >
                Save
              </v-btn>
            </v-card-actions>
        </v-card>
    </v-dialog>
        <v-dialog v-model="dialogDelete" max-width="500px">
            <v-card>
            <v-card-title class="text-h5">Are you sure you want to delete this item?</v-card-title>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn color="blue darken-1" text @click="closeDelete">Cancel</v-btn>
              <v-btn color="blue darken-1" text @click="deleteItemConfirm">OK</v-btn>
              <v-spacer></v-spacer>
            </v-card-actions>
          </v-card>
        </v-dialog>
      </v-toolbar>
    </template>
    <template v-slot:item.actions="{ item }">
      <v-icon
      small
      class="mr-2"
        @click="editItem(item)"
        >
        mdi-pencil
      </v-icon>
      <v-icon
      small
      @click="deleteItem(item)"
      >
      mdi-delete
    </v-icon>
  </template>
   <template v-slot:no-data>
      <v-btn
      color="primary"
        @click="initialize"
      >
        Reset
      </v-btn>
    </template>
</v-data-table>
</template> -->



  
  
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
    @include box($background-box, $border-radius, $background-box);
    border: 1px solid;
    width: 25%;
    height: 100vh;
    @include gridDisplay(10, 1);

    .list-shot{
        @include box($background-buttons-icons, $border-radius, $background-box);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(1, 1, 1, 1)
    }
    .create-shot{
        @include box($background-buttons-icons, $border-radius, $background-box);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        font-size: 1.5em;

        @include border(2, 1, 3, 1)
}

    .number-specimens{
        @include box($background-buttons-icons, $border-radius,  $background-box);
        width: 90%;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        @include border(6, 1, 7, 1)
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