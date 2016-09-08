package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceLanguageIterator theFiniteResourceLanguageIterator = (FiniteResourceLanguageIterator)findAncestorWithClass(this, FiniteResourceLanguageIterator.class);
			pageContext.getOut().print(theFiniteResourceLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for language tag ");
		}
		return SKIP_BODY;
	}
}

