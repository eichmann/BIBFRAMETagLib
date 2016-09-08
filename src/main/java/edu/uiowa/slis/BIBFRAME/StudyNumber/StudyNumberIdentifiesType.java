package edu.uiowa.slis.BIBFRAME.StudyNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StudyNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static StudyNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StudyNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StudyNumberIdentifiesIterator theStudyNumberIdentifiesIterator = (StudyNumberIdentifiesIterator)findAncestorWithClass(this, StudyNumberIdentifiesIterator.class);
			pageContext.getOut().print(theStudyNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StudyNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing StudyNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

