package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkRelationInverseIterator theWorkRelationInverseIterator = (WorkRelationInverseIterator)findAncestorWithClass(this, WorkRelationInverseIterator.class);
			pageContext.getOut().print(theWorkRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for relation tag ");
		}
		return SKIP_BODY;
	}
}

