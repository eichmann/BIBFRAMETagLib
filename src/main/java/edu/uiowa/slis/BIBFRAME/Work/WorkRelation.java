package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkRelationIterator theWorkRelationIterator = (WorkRelationIterator)findAncestorWithClass(this, WorkRelationIterator.class);
			pageContext.getOut().print(theWorkRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for relation tag ");
		}
		return SKIP_BODY;
	}
}

