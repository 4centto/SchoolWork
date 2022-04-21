import React from 'react'
import './styles/Header.css'

const Navigation = () => {

    return (

        <div className="cont-navigation" id="navigator">
            <div className="navigation">
                <div className="btn">
                    <button>HOME</button>
                </div>
                <div className="btn">
                    <button>PROFILE</button>
                </div>
                <div className="btn">
                    <button>SEARCH</button>
                </div>
                <div className="btn">
                    <button>SETTINGS</button>
                </div>
            </div>
        </div>

    )

}

export default Navigation