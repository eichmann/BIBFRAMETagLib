package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkIsUnionOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkIsUnionOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkIsUnionOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkIsUnionOfIterator theWorkIsUnionOfIterator = (WorkIsUnionOfIterator)findAncestorWithClass(this, WorkIsUnionOfIterator.class);
			pageContext.getOut().print(theWorkIsUnionOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for isUnionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for isUnionOf tag ");
		}
		return SKIP_BODY;
	}
}

