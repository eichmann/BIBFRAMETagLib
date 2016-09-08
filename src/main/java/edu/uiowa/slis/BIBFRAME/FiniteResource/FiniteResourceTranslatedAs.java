package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceTranslatedAsIterator theFiniteResourceTranslatedAsIterator = (FiniteResourceTranslatedAsIterator)findAncestorWithClass(this, FiniteResourceTranslatedAsIterator.class);
			pageContext.getOut().print(theFiniteResourceTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

