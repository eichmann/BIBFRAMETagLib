package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NotatedMusic theNotatedMusic = (NotatedMusic)findAncestorWithClass(this, NotatedMusic.class);
			if (!theNotatedMusic.commitNeeded) {
				pageContext.getOut().print(theNotatedMusic.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			NotatedMusic theNotatedMusic = (NotatedMusic)findAncestorWithClass(this, NotatedMusic.class);
			return theNotatedMusic.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing NotatedMusic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			NotatedMusic theNotatedMusic = (NotatedMusic)findAncestorWithClass(this, NotatedMusic.class);
			theNotatedMusic.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for subjectURI tag ");
		}
	}
}

