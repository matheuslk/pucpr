import { initializeApp } from 'firebase/app';
import { getAuth } from 'firebase/auth';
import { getFirestore } from 'firebase/firestore';

const firebaseConfig = {
  apiKey: 'AIzaSyBxsK5ygre68iy0v6UAwxIAcwo6HX2PdjU',
  authDomain: 'react-crud-19c0b.firebaseapp.com',
  projectId: 'react-crud-19c0b',
  storageBucket: 'react-crud-19c0b.appspot.com',
  messagingSenderId: '967428513499',
  appId: '1:967428513499:web:b17c96dffc83ac9941f6fe',
  measurementId: 'G-B7350TG0DV',
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);
const db = getFirestore(app);

export { auth, db };
