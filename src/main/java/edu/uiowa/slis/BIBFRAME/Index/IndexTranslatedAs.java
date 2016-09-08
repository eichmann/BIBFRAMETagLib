package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexTranslatedAs extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexTranslatedAs currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexTranslatedAs.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexTranslatedAsIterator theIndexTranslatedAsIterator = (IndexTranslatedAsIterator)findAncestorWithClass(this, IndexTranslatedAsIterator.class);
			pageContext.getOut().print(theIndexTranslatedAsIterator.getTranslatedAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for translatedAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for translatedAs tag ");
		}
		return SKIP_BODY;
	}
}

