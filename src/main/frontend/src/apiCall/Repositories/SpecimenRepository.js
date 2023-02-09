import SpecimenPayLoad from "../payLoads/SpecimenPayLoad";
export default class SpecimenRepository{
    url;
    constructor(){
        this.url = 'http://localhost:8080/api/specimens';
    }
    async getAll(){
        const response = await fetch(this.url, { method: "GET" });

        let json = await response.json();

       
        let specimens = [];
        for (const specimen of json) {
            let temporalspecimen = new SpecimenPayLoad(specimen.id, specimen.name, specimen.entryDate);

            specimens.push(temporalspecimen);
        }

        return specimens;
    }
}