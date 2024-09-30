import React, { useEffect, useState } from 'react';
import { auth, db } from '../../firebase';
import { doc, getDoc } from 'firebase/firestore';
import './Main.css';

export const Main = () => {
  const [userData, setUserData] = useState(null);

  useEffect(() => {
    const fetchUserData = async () => {
      const user = auth.currentUser;
      if (user) {
        const docRef = doc(db, 'users', user.uid);
        const docSnap = await getDoc(docRef);
        if (docSnap.exists()) {
          setUserData(docSnap.data());
        } else {
          console.log('No such document!');
        }
      }
    };

    fetchUserData();
  }, []);

  return (
    <div className='main-container'>
      {userData ? (
        <div>
          <h2>
            Welcome, {userData.firstName} {userData.lastName}
          </h2>
          <p>Email: {userData.email}</p>
          <p>Date of Birth: {userData.dob}</p>
        </div>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};
