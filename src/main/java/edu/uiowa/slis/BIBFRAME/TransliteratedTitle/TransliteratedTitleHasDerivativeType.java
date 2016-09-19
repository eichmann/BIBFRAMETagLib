package edu.uiowa.slis.BIBFRAME.TransliteratedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransliteratedTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TransliteratedTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TransliteratedTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TransliteratedTitleHasDerivativeIterator theTransliteratedTitleHasDerivativeIterator = (TransliteratedTitleHasDerivativeIterator)findAncestorWithClass(this, TransliteratedTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theTransliteratedTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TransliteratedTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransliteratedTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

