package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsUnionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsUnionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsUnionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsUnionOfIterator theWorkIsUnionOfIterator = (WorkIsUnionOfIterator)findAncestorWithClass(this, WorkIsUnionOfIterator.class);
			pageContext.getOut().print(theWorkIsUnionOfIterator.getIsUnionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

