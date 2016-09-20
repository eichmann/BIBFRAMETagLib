package edu.uiowa.slis.BIBFRAME.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NewspaperHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperHasDerivativeIterator theNewspaperHasDerivativeIterator = (NewspaperHasDerivativeIterator)findAncestorWithClass(this, NewspaperHasDerivativeIterator.class);
			pageContext.getOut().print(theNewspaperHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

