package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSplitInto extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSplitInto currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSplitInto.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSplitIntoIterator theIntegratingResourceSplitIntoIterator = (IntegratingResourceSplitIntoIterator)findAncestorWithClass(this, IntegratingResourceSplitIntoIterator.class);
			pageContext.getOut().print(theIntegratingResourceSplitIntoIterator.getSplitInto());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

