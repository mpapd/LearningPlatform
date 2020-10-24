import * as actionTypes from './actions';

const initialState = {
    token: null,
    quizModal: false
}

const reducer = (state = initialState, action) => {

    switch (action.type){
        case actionTypes.TOKEN_FILLER:
            console.log("#######################");
            console.log(action.payload);
            return {
                token: action.payload.token
            }
        case actionTypes.QUIZ_MODAL:
            return {
                quizModal: !this.state.quizModal
            }
        default:
            return state;

    }

   
}

export default reducer;