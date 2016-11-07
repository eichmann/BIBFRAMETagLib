package edu.uiowa.slis.BIBFRAME.Work;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static WorkCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkCreatedForDegreeIterator theWorkCreatedForDegreeIterator = (WorkCreatedForDegreeIterator)findAncestorWithClass(this, WorkCreatedForDegreeIterator.class);
			pageContext.getOut().print(theWorkCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Work for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Work for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}
