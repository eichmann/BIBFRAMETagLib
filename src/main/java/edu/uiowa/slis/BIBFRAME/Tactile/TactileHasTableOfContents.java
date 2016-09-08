package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasTableOfContents extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasTableOfContents currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasTableOfContents.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasTableOfContentsIterator theTactileHasTableOfContentsIterator = (TactileHasTableOfContentsIterator)findAncestorWithClass(this, TactileHasTableOfContentsIterator.class);
			pageContext.getOut().print(theTactileHasTableOfContentsIterator.getHasTableOfContents());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasTableOfContents tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasTableOfContents tag ");
		}
		return SKIP_BODY;
	}
}

