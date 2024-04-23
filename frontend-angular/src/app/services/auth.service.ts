import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
  public users:any ={
    admin : { password: 'admin', role:['STUDENT','ADMIN']},
    student : { password: 'student', role:['STUDENT']}
  }

  constructor() { }

  public login(username: string, password: string) : boolean{
    if (this.users[username] && this.users[username].password == password) {
      localStorage.setItem('user', JSON.stringify(this.users[username]));
      return true;
    }
    return false;
  }
}
