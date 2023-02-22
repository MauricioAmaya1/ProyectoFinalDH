import React from 'react'
import logo from "../../img/logo.svg"
import styles from "./header.module.css"

const Header = () => {
    return (
        <div className={styles.header}>
            <div className={styles.logoContainer}>
                <img src={logo} alt="Logo" />
                <h2 className={styles.title}>Sentite como en tu hogar</h2>
            </div>
            <div className={styles.btnContainer}>
                <button className={styles.btn}>Crear cuenta</button>
                <button className={styles.btn}>Iniciar sesión</button>
            </div>
        </div>
    )
}

export default Header