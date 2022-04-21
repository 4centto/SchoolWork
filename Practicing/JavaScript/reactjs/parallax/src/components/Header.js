import React from 'react'
import BG from '../images/bg.jpg'
import MOUNTAINS from '../images/mountains.png'
import TREES from '../images/trees.png'
import './styles/Header.css'

const Header = () => {

    return (

        <div className="cont-header">
            <div className="header">
                <img src={BG} id="bg" />
                <img src={MOUNTAINS} id="mountains" />
                <img src={TREES} />
            </div>
        </div>

    )

}

export default Header