import { useState } from 'react'
import "./app.css"
import Header from './templates/header/Header'
import Body from './templates/body/Body'
import Footer from './templates/footer/Footer'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
      <Header/>
      <Body/>
      <Footer/>
    </div>
  )
}

export default App
