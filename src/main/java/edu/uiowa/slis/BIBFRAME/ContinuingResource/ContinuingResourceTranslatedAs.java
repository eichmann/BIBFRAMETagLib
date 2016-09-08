package edu.uiowa.slis.BIBFRAME.ContinuingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinuingResourceTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContinuingResourceTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinuingResourceTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinuingResourceTranslatedAsIterator theContinuingResourceTranslatedAsIterator = (ContinuingResourceTranslatedAsIterator)findAncestorWithClass(this, ContinuingResourceTranslatedAsIterator.class);
			pageContext.getOut().print(theContinuingResourceTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing ContinuingResource for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContinuingResource for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

