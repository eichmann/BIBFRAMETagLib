package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexLanguageType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexLanguageType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexLanguageType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexLanguageIterator theIndexLanguageIterator = (IndexLanguageIterator)findAncestorWithClass(this, IndexLanguageIterator.class);
			pageContext.getOut().print(theIndexLanguageIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for language tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for language tag ");
		}
		return SKIP_BODY;
	}
}

