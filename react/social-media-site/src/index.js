import React from 'react';
import ReactDOM from 'react-dom';
import faker from 'faker';
import CommentDetail from './CommentDetail';

const App = () => {
  return (
    <div className="ui container comments">
      <CommentDetail author="Sam" />
      <CommentDetail author="Alex" />
      <CommentDetail author="Auburn" />
      <CommentDetail author="Anna" />
      <CommentDetail author="Alexander" />
      <CommentDetail author="Amy" />
      <CommentDetail author="Ashley" />
    </div>  
  );
};

ReactDOM.render(
  <App />,
  document.querySelector('#root')
);