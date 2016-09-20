package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSplitIntoIterator theDissertationSplitIntoIterator = (DissertationSplitIntoIterator)findAncestorWithClass(this, DissertationSplitIntoIterator.class);
			pageContext.getOut().print(theDissertationSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

