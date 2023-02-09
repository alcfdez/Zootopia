import Repository from '../apiCall/Repository'
import { defineStore } from 'pinia'

export const specimenStore = defineStore('specimen', {
    // arrow function recommended for full type inference
    state:()=>({
        specimens: [],

    }),
    actions:{
        async Asign(){
            const api = new Repository('specimens')
            const reporitory = api.chooseApi();

            const response = await reporitory.getAll();

            this.specimens = response;
            return response;
            
        },

        
        
    }
  })