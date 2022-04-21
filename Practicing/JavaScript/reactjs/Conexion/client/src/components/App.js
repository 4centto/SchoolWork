import { BrowserRouter, Route, Switch } from 'react-router-dom'
import Main from '../pages/Main'
import Mostrar from '../pages/Mostrar'
import Insertar from '../pages/Insertar'
import Eliminar from '../pages/Eliminar'

function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/productos" component={Mostrar} />
        <Route exact path="/insertar" component={Insertar} />
        <Route exact path="/eliminar" component={Eliminar} />
        <Route component={Main} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
