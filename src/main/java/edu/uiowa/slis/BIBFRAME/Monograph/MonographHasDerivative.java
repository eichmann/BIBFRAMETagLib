package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographHasDerivativeIterator theMonographHasDerivativeIterator = (MonographHasDerivativeIterator)findAncestorWithClass(this, MonographHasDerivativeIterator.class);
			pageContext.getOut().print(theMonographHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

