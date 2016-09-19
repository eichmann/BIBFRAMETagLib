package edu.uiowa.slis.BIBFRAME.TranslatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslatedTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TranslatedTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslatedTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TranslatedTitleHasDerivativeIterator theTranslatedTitleHasDerivativeIterator = (TranslatedTitleHasDerivativeIterator)findAncestorWithClass(this, TranslatedTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theTranslatedTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TranslatedTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing TranslatedTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

