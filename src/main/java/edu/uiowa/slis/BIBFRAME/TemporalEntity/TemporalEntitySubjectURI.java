package edu.uiowa.slis.BIBFRAME.TemporalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TemporalEntitySubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TemporalEntitySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TemporalEntitySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TemporalEntity theTemporalEntity = (TemporalEntity)findAncestorWithClass(this, TemporalEntity.class);
			if (!theTemporalEntity.commitNeeded) {
				pageContext.getOut().print(theTemporalEntity.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TemporalEntity theTemporalEntity = (TemporalEntity)findAncestorWithClass(this, TemporalEntity.class);
			return theTemporalEntity.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TemporalEntity for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TemporalEntity theTemporalEntity = (TemporalEntity)findAncestorWithClass(this, TemporalEntity.class);
			theTemporalEntity.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TemporalEntity for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TemporalEntity for subjectURI tag ");
		}
	}
}

