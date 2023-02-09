import SpecimenRepository from "./Repositories/SpecimenRepository";
export default class Repository{
    api;
    constructor(api){
        this.api = api;
    }
    chooseApi(){
        if(this.api==='specimens') return new SpecimenRepository();
    }
}