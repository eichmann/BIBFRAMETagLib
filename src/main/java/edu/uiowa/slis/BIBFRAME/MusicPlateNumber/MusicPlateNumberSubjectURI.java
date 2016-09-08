package edu.uiowa.slis.BIBFRAME.MusicPlateNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPlateNumberSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPlateNumberSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPlateNumberSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MusicPlateNumber theMusicPlateNumber = (MusicPlateNumber)findAncestorWithClass(this, MusicPlateNumber.class);
			if (!theMusicPlateNumber.commitNeeded) {
				pageContext.getOut().print(theMusicPlateNumber.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPlateNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MusicPlateNumber theMusicPlateNumber = (MusicPlateNumber)findAncestorWithClass(this, MusicPlateNumber.class);
			return theMusicPlateNumber.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MusicPlateNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MusicPlateNumber theMusicPlateNumber = (MusicPlateNumber)findAncestorWithClass(this, MusicPlateNumber.class);
			theMusicPlateNumber.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPlateNumber for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for subjectURI tag ");
		}
	}
}

