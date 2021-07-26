import { INIT_ID_STATE, INIT_PASSWORD_STATE } from '../status/login'
import { SET } from '../actions/login';
import { combineReducers } from 'redux';

function id (state = INIT_ID_STATE, action) {
    switch(action.type) {
        case SET:
            return {
                ...state,
                value: state
            }
        default:
            return state
    }
}

function password (state = INIT_PASSWORD_STATE, action) {
    switch(action.type) {
        case SET:
            return {
                ...state,
                value: state.value
            }
        default:
            return state
    }
}

const loginReducer = combineReducers({ id, password });

export default loginReducer