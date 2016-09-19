package edu.uiowa.slis.BIBFRAME.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleHasDerivativeIterator theTitleHasDerivativeIterator = (TitleHasDerivativeIterator)findAncestorWithClass(this, TitleHasDerivativeIterator.class);
			pageContext.getOut().print(theTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

