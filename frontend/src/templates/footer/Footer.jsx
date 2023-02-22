import React from 'react'
import styles from './footer.module.css'
import facebookIcon from '../../img/iconFacebook.svg'
import lindekdinIcon from '../../img/iconLinkedin.svg'
import twitterIcon from '../../img/iconTweet.svg'
import instagramIcon from '../../img/iconInstagram.svg'

const Footer = () => {
    return (
        <div className={styles.footer}>
            <h3 className={styles.copyright}>©2023 Digital Booking</h3>
            <ul className={styles.SocialMedia}>
                <li><img className={styles.socialMediaIcon} src={facebookIcon} alt="Facebook Icon" /></li>
                <li><img className={styles.socialMediaIcon} src={lindekdinIcon} alt="Linkedin Icon" /></li>
                <li><img className={styles.socialMediaIcon} src={twitterIcon} alt="Twitter Icon" /></li>
                <li><img className={styles.socialMediaIcon} src={instagramIcon} alt="Instagram Icon" /></li>
            </ul>
        </div>
    )
}

export default Footer