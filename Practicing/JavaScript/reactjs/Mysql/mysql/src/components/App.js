import './styles/App.css';
import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Button from './Button'
import Consultas from '../pages/Consultas'

function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/" component={Button} />
        <Route exact path="/consultas" component={Consultas} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
