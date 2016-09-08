package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IndexTranslatesIterator theIndexTranslatesIterator = (IndexTranslatesIterator)findAncestorWithClass(this, IndexTranslatesIterator.class);
			pageContext.getOut().print(theIndexTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Index for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for translates tag ");
		}
		return SKIP_BODY;
	}
}

