package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceSplitIntoType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceSplitIntoType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceSplitIntoType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceSplitIntoIterator theIntegratingResourceSplitIntoIterator = (IntegratingResourceSplitIntoIterator)findAncestorWithClass(this, IntegratingResourceSplitIntoIterator.class);
			pageContext.getOut().print(theIntegratingResourceSplitIntoIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for splitInto tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for splitInto tag ");
		}
		return SKIP_BODY;
	}
}

