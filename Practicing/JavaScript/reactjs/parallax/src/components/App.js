import './styles/App.css';
import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Menu from '../pages/Menu'

const App = () => {

  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="" component={Menu} />
      </Switch>
    </BrowserRouter>

  )

}

export default App;
