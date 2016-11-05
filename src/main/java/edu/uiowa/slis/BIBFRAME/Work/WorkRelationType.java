package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkRelationIterator theWorkRelationIterator = (WorkRelationIterator)findAncestorWithClass(this, WorkRelationIterator.class);
			pageContext.getOut().print(theWorkRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for relation tag ");
		}
		return SKIP_BODY;
	}
}

