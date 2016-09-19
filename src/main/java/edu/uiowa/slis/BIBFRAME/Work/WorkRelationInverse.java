package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkRelationInverseIterator theWorkRelationInverseIterator = (WorkRelationInverseIterator)findAncestorWithClass(this, WorkRelationInverseIterator.class);
			pageContext.getOut().print(theWorkRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for relation tag ");
		}
		return SKIP_BODY;
	}
}

