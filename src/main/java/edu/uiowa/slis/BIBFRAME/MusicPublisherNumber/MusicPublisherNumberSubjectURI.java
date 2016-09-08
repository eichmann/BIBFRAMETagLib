package edu.uiowa.slis.BIBFRAME.MusicPublisherNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPublisherNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPublisherNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPublisherNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MusicPublisherNumber theMusicPublisherNumber = (MusicPublisherNumber)findAncestorWithClass(this, MusicPublisherNumber.class);
			if (!theMusicPublisherNumber.commitNeeded) {
				pageContext.getOut().print(theMusicPublisherNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPublisherNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MusicPublisherNumber theMusicPublisherNumber = (MusicPublisherNumber)findAncestorWithClass(this, MusicPublisherNumber.class);
			return theMusicPublisherNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MusicPublisherNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MusicPublisherNumber theMusicPublisherNumber = (MusicPublisherNumber)findAncestorWithClass(this, MusicPublisherNumber.class);
			theMusicPublisherNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPublisherNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPublisherNumber for subjectURI tag ");
		}
	}
}

